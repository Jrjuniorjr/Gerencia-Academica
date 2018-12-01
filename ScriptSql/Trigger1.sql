
#Mandar disciplinas cursadas para hist�rico ao fim do per�odo
DELIMITER $$
CREATE TRIGGER Before_Delete_Cursando
BEFORE DELETE on Cursando
FOR EACH ROW
BEGIN
	IF(SELECT Disciplina.tipo FROM Disciplina WHERE old.idDisciplina=Disciplina.id)='Ativa' THEN
		#calcular media	
		set @media = (old.primeiroGQ + old.segundoGQ)/2 ;  	
		INSERT INTO Historico(Historico.idMatricula, Historico.idDisciplina, Historico.notaFinal, Historico.dataCursada)VALUES(old.idMatricula,old.idDisciplina,@media, CURDATE());
	END IF;
END $$
DELIMITER ;