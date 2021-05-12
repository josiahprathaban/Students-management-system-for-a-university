import { Attribute } from '@angular/core';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-admin-header',
  templateUrl: './admin-header.component.html',
  styleUrls: ['./admin-header.component.scss']
})
export class AdminHeaderComponent implements OnInit {

  constructor(@Attribute('heading') public heading: string, @Attribute('divider') public divider: string, @Attribute('sub_heading') public sub_heading: string) { }

  ngOnInit(): void {
  }

}
