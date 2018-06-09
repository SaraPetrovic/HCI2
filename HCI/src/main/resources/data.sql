insert into smer(oznaka, naziv, datum, opis) values ('siit', 'softversko inzenjerstvo i informacione tehnologije', '10.10.2014','opis smera' )
insert into smer(oznaka, naziv, datum, opis) values ('e1', 'softversko inzenjerstvo i informacione tehnologije', '10.10.2014','opis smera' )

insert into predmet(oznaka, naziv, opis, smer_oznaka, velicina_grupe, duzina_termina, broj_termina, projektor, tabla, pametna_tabla, op_sistem  ) values ('HCI', 'Interakcija covek racunar', 'opis predmeta', 'siit', '15', '2', '4', true, true, false, 'LINUX' )
insert into predmet(oznaka, naziv, opis, smer_oznaka, velicina_grupe, duzina_termina, broj_termina, projektor, tabla, pametna_tabla, op_sistem  ) values ('ISA', 'Baze podataka', 'opis predmeta', 'siit', '15', '3', '4', true, true, false, 'LINUX' )
insert into predmet(oznaka, naziv, opis, smer_oznaka, velicina_grupe, duzina_termina, broj_termina, projektor, tabla, pametna_tabla, op_sistem  ) values ('MRS', 'Baze podataka', 'opis predmeta', 'siit', '15', '4', '4', true, true, false, 'WINDOWS' )

insert into ucionica(oznaka, opis, broj_mesta, projektor, tabla, pametna_tabla, op_sistem ) values ('L1', 'opis ucionice', '25', false, true, true, 'WINLINUX')
insert into ucionica(oznaka, opis, broj_mesta, projektor, tabla, pametna_tabla, op_sistem ) values ('L2', 'opis ucionice', '10', true, true, true, 'LINUX')
insert into ucionica(oznaka, opis, broj_mesta, projektor, tabla, pametna_tabla, op_sistem ) values ('L3', 'opis ucionice', '25', true, true, true, 'WINDOWS')
insert into ucionica(oznaka, opis, broj_mesta, projektor, tabla, pametna_tabla, op_sistem ) values ('L4', 'opis ucionice', '25', true, true, true, 'WINLINUX')
insert into ucionica(oznaka, opis, broj_mesta, projektor, tabla, pametna_tabla, op_sistem ) values ('L5', 'opis ucionice', '25', true, true, true, 'WINLINUX')


insert into softver(oznaka, naziv, proizvodjac, sajt, godina_izdavanja, opis, cena) values ('VS15', 'Visual studio', 'Microsoft', 'www.microsoft.com', '2015', 'opis proizvoda', '2000')
insert into softver(oznaka, naziv, proizvodjac, sajt, godina_izdavanja, opis, cena) values ('MTLB13', 'MATLAB R2013', 'MathWorks', 'www.mathworks.com', '2013', 'Matlab softver', '500')
insert into softver(oznaka, naziv, proizvodjac, sajt, godina_izdavanja, opis, cena) values ('PYCH', 'PyCharm 2015', 'JetBrains', 'www.jetbrains.com', '2015', 'Python IDE', '1500')
insert into softver(oznaka, naziv, proizvodjac, sajt, godina_izdavanja, opis, cena) values ('ECL', 'Eclipse Neon', 'Eclipse Foundation', 'www.eclipse.org', '2017', 'Eclipse IDE', '1700')
insert into softver(oznaka, naziv, proizvodjac, sajt, godina_izdavanja, opis, cena) values ('asd', 'Eclipse Neon', 'Eclipse Foundation', 'www.eclipse.org', '2017', 'Eclipse IDE', '1700')

insert into predmet_softver(predmet_oznaka, softver_oznaka) values ('HCI', 'VS15')

insert into predmet_softver(predmet_oznaka, softver_oznaka) values ('HCI', 'VS15')
insert into predmet_softver(predmet_oznaka, softver_oznaka) values ('ISA', 'ECL')
insert into predmet_softver(predmet_oznaka, softver_oznaka) values ('MRS', 'ECL')
insert into predmet_softver(predmet_oznaka, softver_oznaka) values ('MRS', 'PYCH')

insert into ucionica_softveri(ucionica_oznaka, softveri_oznaka) values ('L1', 'VS15')
insert into ucionica_softveri(ucionica_oznaka, softveri_oznaka) values ('L1', 'ECL')
insert into ucionica_softveri(ucionica_oznaka, softveri_oznaka) values ('L1', 'PYCH')
insert into ucionica_softveri(ucionica_oznaka, softveri_oznaka) values ('L1', 'MTLB13')
insert into ucionica_softveri(ucionica_oznaka, softveri_oznaka) values ('L2', 'VS15')
insert into ucionica_softveri(ucionica_oznaka, softveri_oznaka) values ('L2', 'MTLB13')
insert into ucionica_softveri(ucionica_oznaka, softveri_oznaka) values ('L3', 'ECL')
insert into ucionica_softveri(ucionica_oznaka, softveri_oznaka) values ('L4', 'PYCH')
insert into ucionica_softveri(ucionica_oznaka, softveri_oznaka) values ('L5', 'ECL')
insert into ucionica_softveri(ucionica_oznaka, softveri_oznaka) values ('L5', 'PYCH')
