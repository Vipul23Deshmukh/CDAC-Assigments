DELIMITER //

CREATE PROCEDURE getcnt(
   IN p_MARKS INT,       -- input parameter
   OUT p_count INT       -- output parameter
)
BEGIN
    SELECT COUNT(*) INTO p_count
    FROM EMP
    WHERE MARKS<=COUNT;
END //

DELIMITER ;
