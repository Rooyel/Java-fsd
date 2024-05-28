import { Component } from '@angular/core';

@Component({
  selector: 'app-product-list',
  //templateUrl: './product-list.component.html',
  template: `
  <app-product-list></app-product-list>
  `,
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent {
  constructor() { }

  ngOnInit(): void {
  }
}
