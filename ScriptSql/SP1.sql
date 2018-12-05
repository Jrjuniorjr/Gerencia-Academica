#Enviar disciplinas do Cursando pro Hist?rico (fechar o per?odo) - Ativa a trigger

DELIMITER $$
CREATE PROCEDURE cursandoHistorico () 
BEGIN 
DELETE FROM Cursando;
END$$
DELIMITER ;