import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { GtnProductsPage } from './gtn-products.page';

const routes: Routes = [
  {
    path: '',
    component: GtnProductsPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class GtnProductsPageRoutingModule {}
