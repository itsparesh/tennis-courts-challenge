insert into guest(id, name) values(null, 'Roger Federer');
insert into guest(id, name) values(null, 'Rafael Nadal');

insert into tennis_court(id, name) values(null, 'Roland Garros - Court Philippe-Chatrier');
insert into tennis_court(id, name) values(null, 'Indian - Court');
insert into tennis_court(id, name) values(null, 'Irish - Court');

insert
    into
        schedule
        (id, start_date_time, end_date_time, tennis_court_id)
    values
        (null, '2020-12-20T20:00:00.0', '2021-02-20T21:00:00.0', 1),
        (null, '2021-12-18T10:00:00.0', '2022-02-27T21:00:00.0', 1),
        (null, '2020-12-10T20:00:00.0', '2022-01-30T21:00:00.0', 3);