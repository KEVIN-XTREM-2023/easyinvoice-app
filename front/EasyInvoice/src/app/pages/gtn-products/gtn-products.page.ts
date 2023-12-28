import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ToastController } from '@ionic/angular';
import { Observable } from 'rxjs';
import { AlertController } from '@ionic/angular';
import { ModalController } from '@ionic/angular';

@Component({
  selector: 'app-gtn-products',
  templateUrl: './gtn-products.page.html',
  styleUrls: ['./gtn-products.page.scss'],
})
export class GtnProductsPage implements OnInit {

  codigo_barras!: string;
  nom_producto!: string;
  descrip_prod!: string;
  id_prom_pro!: string;
  id_cat_pro!: string;
  unidades_dispon!: string;
  precio!: string;

  showBackdrop: boolean = false;
  
  items: any[] = [
    { id: 1, name: 'Item 1', description: 'Descripción del Item 1' },
    { id: 2, name: 'Item 2', description: 'Descripción del Item 2' },
    { id: 3, name: 'Item 3', description: 'Descripción del Item 3' },
  ];

  selectedItems: any[] = [];

  constructor(private toastController: ToastController, private http: HttpClient,
    private alertController: AlertController, private modalController: ModalController) {

    //this.items = [];

   }

   selectItem(item: any) {
    const index = this.selectedItems.indexOf(item);
    if (index > -1) {
      this.selectedItems.splice(index, 1); // Deseleccionar elemento si ya está seleccionado
    } else {
      this.selectedItems.push(item); // Seleccionar elemento si no está seleccionado
    }
  }

  isSelected(item: any): boolean {
    return this.selectedItems.indexOf(item) > -1;
  }

  vender() {
    // Aquí puedes capturar la información de los elementos seleccionados y realizar las acciones necesarias
    console.log(this.selectedItems);
  }

  ngOnInit() {
  }

  loadDataList() {
    
  }

  getItems(): Observable<any[]> {
    const url = "";
    return this.http.get<any[]>(url);
  }


  deleteItem(item: any) {

  }

  editItem(item: any) {

  }

  toggleBackdrop() {
    this.showBackdrop = !this.showBackdrop;
  }

  async presentToast(message: string) {
    const toast = await this.toastController.create({
      message: message,
      duration: 2000
    });
    toast.present();
  }

}
