import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DischargepatientComponent } from './dischargepatient.component';

describe('DischargepatientComponent', () => {
  let component: DischargepatientComponent;
  let fixture: ComponentFixture<DischargepatientComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DischargepatientComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DischargepatientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
