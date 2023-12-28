import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { NavController } from '@ionic/angular';
import { FormControl, Validators } from '@angular/forms';
import { DataSharingService } from '../../services/data-sharing.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {

  username!: string;
  password!: string;

  wrongCredentials = new FormControl('', Validators.required);
  isEmptyInputText = new FormControl('', Validators.required);

  constructor(private http: HttpClient, private navCtrl: NavController,
    private dataSharingService: DataSharingService) { }

  ngOnInit() {
  }

  isEmptyInput(username: string, password: string) {
    if (!username || !password || /^\s+|\s+$/g.test(username) || /^\s+|\s+$/g.test(password)
          || !this.isEmptyInputText.invalid) {
            
            this.clearInput();
            this.isEmptyInputText.markAsTouched();
            return false;
    } else {
      return true;
    }
  }

  clearInput() {
    this.username = '';
    this.password = '';
    this.isEmptyInputText.markAsUntouched();
    this.wrongCredentials.markAsUntouched();

  }

  toSendData(dataUser: any) {
    this.dataSharingService.setJsonData(dataUser);
  }

  ingresar() {
    const username = this.username;
    const password = this.password;
    const url = 'link del servicio';
    
    if (this.isEmptyInput(username, password)) {
      
      const credentials = JSON.stringify({
        username: username,
        password: password,
      });
      
      const headers = {
        'Content-Type': 'application/json'
      };
  
      this.http.post(url, credentials, { headers, observe: 'response' }).subscribe(
        (response: HttpResponse<any>) => {
          if (response && response.status == 200 && response.body) {
            try {
              console.log(response.body);
              this.toSendData(response.body);
              this.clearInput();
              this.navCtrl.navigateForward('/home');
            } catch (error) {
              console.error('Error al procesar la respuesta:', error);
            }
          } else {
            this.clearInput();
            this.wrongCredentials.markAsTouched();
            console.error('Respuesta HTTP nula o vacía recibida');
          }
        },
        (error) => {
          console.error(error);
        }
      );
    } 
  }

}
