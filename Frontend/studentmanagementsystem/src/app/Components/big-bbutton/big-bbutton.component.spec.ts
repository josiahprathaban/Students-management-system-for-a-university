import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BigBbuttonComponent } from './big-bbutton.component';

describe('BigBbuttonComponent', () => {
  let component: BigBbuttonComponent;
  let fixture: ComponentFixture<BigBbuttonComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BigBbuttonComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BigBbuttonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
