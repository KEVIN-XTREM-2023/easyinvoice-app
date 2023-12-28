import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { GtnProductsPageRoutingModule } from './gtn-products-routing.module';

import { GtnProductsPage } from './gtn-products.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    GtnProductsPageRoutingModule
  ],
  declarations: [GtnProductsPage]
})
export class GtnProductsPageModule {}
