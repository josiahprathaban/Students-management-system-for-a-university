import { Attribute } from '@angular/core';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-form-text-field',
  templateUrl: './form-text-field.component.html',
  styleUrls: ['./form-text-field.component.scss']
})
export class FormTextFieldComponent implements OnInit {

  constructor(@Attribute('field_name') public field_name: string,
  @Attribute('type') public type: string,
  @Attribute('placeholder') public placeholder: string,
  @Attribute('name') public name: string,
  @Attribute('ngModel') public ngModel: string) { }

  ngOnInit(): void {
  }

  modelName(){
    return eval(this.ngModel);
  }

}
