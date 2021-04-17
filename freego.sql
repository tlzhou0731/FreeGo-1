/*
insert into userconcern values(1000, (select userId from travelnotelist where travelNoteId = 35));
update userprefer set preferWeight = 0.3 WHERE userId = 1000 and tagId = 1;
*/
UPDATE userprefer SET preferWeight = 0.1 WHERE userId = 1000 AND tagId = 1;









