import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { StudentHomeComponent } from './student-home/student-home.component';
import { AdminHomeComponent } from './admin-home/admin-home.component';
import { RestApiService } from './rest-api.service';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { SearchComponent } from './Components/search/search.component';
import { BigBbuttonComponent } from './Components/big-bbutton/big-bbutton.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatIconModule } from '@angular/material/icon';
import { FooterComponent } from './Components/footer/footer.component';
import { AdminHeaderComponent } from './Components/admin-header/admin-header.component';
import { AdminAddStudentComponent } from './admin-add-student/admin-add-student.component';
import { FormTextFieldComponent } from './Components/form-text-field/form-text-field.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    StudentHomeComponent,
    AdminHomeComponent,
    SearchComponent,
    BigBbuttonComponent,
    FooterComponent,
    AdminHeaderComponent,
    AdminAddStudentComponent,
    FormTextFieldComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatIconModule
  ],
  providers: [RestApiService],
  bootstrap: [AppComponent]
})
export class AppModule { }
