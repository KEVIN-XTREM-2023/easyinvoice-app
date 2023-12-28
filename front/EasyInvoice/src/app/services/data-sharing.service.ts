import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataSharingService {

  private userData: any;

  constructor() { }

  setJsonData(data: any) {
    this.userData = data;
  }

  getJsonData() {
    return this.userData;
  }
}
