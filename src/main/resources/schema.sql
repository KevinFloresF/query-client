CREATE TABLE Client (
  clientId    NUMBER PRIMARY KEY ,
  name     VARCHAR(64) ,
  type_document   VARCHAR(64) ,
  number_document     VARCHAR(64),
  datebirth VARCHAR(64));

CREATE TABLE Plan (
  planId    NUMBER PRIMARY KEY ,
  name     VARCHAR(64) ,
  price  NUMBER );

  CREATE TABLE Mobile (
    mobileId    NUMBER PRIMARY KEY ,
    number     VARCHAR(64) ,
    state   VARCHAR(64) ,
    type     VARCHAR(64),
    planFk NUMBER,
    clientFk NUMBER,
    FOREIGN KEY(planFk) references Plan(planId),
    FOREIGN KEY(clientFk) references Client(clientid));

CREATE TABLE Ofert (
  OfertId    NUMBER PRIMARY KEY ,
  code     VARCHAR(64) ,
  description   VARCHAR(64) ,
  begin_date    TIMESTAMP,
  end_date  TIMESTAMP);

  CREATE TABLE Ofert_Mobile (
mobileFk NUMBER,
ofertFk NUMBER,
FOREIGN KEY(mobileFk) references Mobile(mobileId),
 FOREIGN KEY(ofertFk) references Ofert(ofertId));
