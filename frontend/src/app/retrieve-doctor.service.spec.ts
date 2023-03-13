import { TestBed } from '@angular/core/testing';

import { RetrieveDoctorService } from './retrieve-doctor.service';

describe('RetrieveDoctorService', () => {
  let service: RetrieveDoctorService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RetrieveDoctorService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
