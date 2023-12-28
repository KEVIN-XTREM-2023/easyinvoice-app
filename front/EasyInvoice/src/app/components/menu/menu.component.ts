import { Component, OnInit } from '@angular/core';
import { DataSharingService } from '../../services/data-sharing.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss'],
})
export class MenuComponent implements OnInit {
  public items = [
    { name: 'Perfil', image: 'assets/icon/icon-perfil.svg', redirect:"#"},
    { name: 'Gestión \nProductos', image: 'assets/icon/icon-gtnproducts.svg', redirect:"gtn-products" },
    { name: 'Gestión \nClientes', image: 'assets/icon/icon-gtnclient.svg', redirect:"#" },
    { name: 'Facturar', image: 'assets/icon/icon-facturar.svg', redirect:"#" },
    { name: 'Gestión \nEstablecimiento', image: 'assets/icon/icon-gtnestablec.svg' , redirect:""},
    { name: 'Cerrar Sesión', image: 'assets/icon/icon-logout.svg', redirect:"login" }
  ];

  private receivedData: any;
  namesUser!: string;
  rolUser!: string;

  constructor(private dataSharingService: DataSharingService) {}

  ngOnInit() { }

  onMenuOpen() {
    this.receivedData = this.dataSharingService.getJsonData();
    this.namesUser = this.receivedData.nombrePers;
    this.rolUser = this.receivedData.rolPers;
  }


}
