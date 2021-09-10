INSERT INTO Client (clientId, name, type_document,number_document,datebirth) VALUES
  (1,'Kevin1', 'DNI', 71980004,'1995-01-29'),
  (2,'Kevin2', 'DNI', 99999999,'1996-03-02');

INSERT INTO Plan (planId,name,price) VALUES
     (1,'Plan Prepago',null),
    (2,'Plan 29.90',29.0),
    (3,'Plan 39.90',39.0);
 INSERT INTO Mobile (mobileId, number,state,type,planFk) VALUES
    (1,930029222, 'Activo' , 'PostPago',2),
    (2,22222222, 'Activo' , 'PostPago',3),
    (3,33333333, 'Activo' , 'Prepago',1);

INSERT INTO Ofert (ofertId ,code,description,begin_date,end_date) VALUES
    (1,'O001','Promoción Datos Ilimitados','2021-09-08','2021-10-08'),
    (2,'O002','Promoción Tiktok Gratis','2021-08-08','2021-09-08');



INSERT INTO Client_Mobile (clientFk,mobileFk) VALUES
    (1,1),
    (1,2),
    (2,1);
 INSERT INTO Ofert_Mobile (mobileFk,ofertFk) VALUES
     (1,1),
     (1,2),
     (2,1),
     (3,1);
