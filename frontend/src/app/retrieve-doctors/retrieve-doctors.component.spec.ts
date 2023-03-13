import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetrieveDoctorsComponent } from './retrieve-doctors.component';

describe('RetrieveDoctorsComponent', () => {
  let component: RetrieveDoctorsComponent;
  let fixture: ComponentFixture<RetrieveDoctorsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetrieveDoctorsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RetrieveDoctorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
