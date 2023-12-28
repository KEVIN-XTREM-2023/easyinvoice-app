import { ComponentFixture, TestBed } from '@angular/core/testing';
import { GtnProductsPage } from './gtn-products.page';

describe('GtnProductsPage', () => {
  let component: GtnProductsPage;
  let fixture: ComponentFixture<GtnProductsPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(GtnProductsPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
