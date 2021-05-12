import { Attribute } from '@angular/core';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-big-bbutton',
  templateUrl: './big-bbutton.component.html',
  styleUrls: ['./big-bbutton.component.scss']
})
export class BigBbuttonComponent implements OnInit {

  constructor(@Attribute('button_name') public button_name: string, @Attribute('button_discription') public button_discription: string, @Attribute('button_target') public button_target: string) { }

  ngOnInit(): void {
  }

}
