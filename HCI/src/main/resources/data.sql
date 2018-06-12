insert into smer(id, oznaka, naziv, datum, opis) values ('11', 'siit', 'softversko inzenjerstvo i informacione tehnologije', '2014-10-10','opis smera' )
insert into smer(id, oznaka, naziv, datum, opis) values ('12', 'e1', 'racunarstvo i automatika', '2014-10-10','opis smera' )

insert into predmet(id, oznaka, naziv, opis, smer_id, velicina_grupe, duzina_termina, broj_termina, projektor, tabla, pametna_tabla, op_sistem  ) values ('1', 'HCI', 'Interakcija covek racunar', 'opis predmeta', '11', '15', '2', '4', true, true, false, 'LINUX' )
insert into predmet(id, oznaka, naziv, opis, smer_id, velicina_grupe, duzina_termina, broj_termina, projektor, tabla, pametna_tabla, op_sistem  ) values ('2', 'ISA', 'Baze podataka', 'opis predmeta', '11', '15', '3', '4', true, true, false, 'LINUX' )
insert into predmet(id, oznaka, naziv, opis, smer_id, velicina_grupe, duzina_termina, broj_termina, projektor, tabla, pametna_tabla, op_sistem  ) values ('3', 'MRS', 'Baze podataka', 'opis predmeta', '11', '15', '4', '4', true, true, false, 'WINDOWS' )

insert into ucionica(id, oznaka, opis, broj_mesta, projektor, tabla, pametna_tabla, op_sistem ) values ('1', 'L1', 'opis ucionice', '25', false, true, true, 'WINLINUX')
insert into ucionica(id, oznaka, opis, broj_mesta, projektor, tabla, pametna_tabla, op_sistem ) values ('2', 'L2', 'opis ucionice', '10', true, true, true, 'LINUX')
insert into ucionica(id, oznaka, opis, broj_mesta, projektor, tabla, pametna_tabla, op_sistem ) values ('3', 'L3', 'opis ucionice', '25', true, true, true, 'WINDOWS')
insert into ucionica(id, oznaka, opis, broj_mesta, projektor, tabla, pametna_tabla, op_sistem ) values ('4', 'L4', 'opis ucionice', '25', true, true, true, 'WINLINUX')
insert into ucionica(id, oznaka, opis, broj_mesta, projektor, tabla, pametna_tabla, op_sistem ) values ('5', 'L5', 'opis ucionice', '25', true, true, true, 'WINLINUX')


insert into softver(id, oznaka, naziv, proizvodjac, sajt, godina_izdavanja, opis, cena) values ('1', 'VS15', 'Visual studio', 'Microsoft', 'www.microsoft.com', '2015', 'opis proizvoda', '2000')
insert into softver(id, oznaka, naziv, proizvodjac, sajt, godina_izdavanja, opis, cena) values ('2', 'MTLB13', 'MATLAB R2013', 'MathWorks', 'www.mathworks.com', '2013', 'Matlab softver', '500')
insert into softver(id, oznaka, naziv, proizvodjac, sajt, godina_izdavanja, opis, cena) values ('3', 'PYCH', 'PyCharm 2015', 'JetBrains', 'www.jetbrains.com', '2015', 'Python IDE', '1500')
insert into softver(id, oznaka, naziv, proizvodjac, sajt, godina_izdavanja, opis, cena) values ('4', 'ECL', 'Eclipse Neon', 'Eclipse Foundation', 'www.eclipse.org', '2017', 'Eclipse IDE', '1700')


insert into predmet_softver(predmet_id, softver_id) values ('1', '1')
insert into predmet_softver(predmet_id, softver_id) values ('2', '4')
insert into predmet_softver(predmet_id, softver_id) values ('3', '4')
insert into predmet_softver(predmet_id, softver_id) values ('3', '3')

insert into ucionica_softver(ucionica_id, softver_id) values ('1', '1')
insert into ucionica_softver(ucionica_id, softver_id) values ('1', '4')
insert into ucionica_softver(ucionica_id, softver_id) values ('1', '3')
insert into ucionica_softver(ucionica_id, softver_id) values ('1', '2')
insert into ucionica_softver(ucionica_id, softver_id) values ('2', '1')
insert into ucionica_softver(ucionica_id, softver_id) values ('2', '2')
insert into ucionica_softver(ucionica_id, softver_id) values ('3', '4')
insert into ucionica_softver(ucionica_id, softver_id) values ('4', '3')
insert into ucionica_softver(ucionica_id, softver_id) values ('5', '4')
insert into ucionica_softver(ucionica_id, softver_id) values ('5', '3')
