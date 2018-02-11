CREATE USER 'springframework'@'localhost' IDENTIFIED BY 'guru';
CREATE USER 'springgrasshopper'@'localhost' IDENTIFIED BY 'ants';

GRANT SELECT ON springguru.* to 'springframework'@'localhost';
GRANT INSERT ON springguru.* to 'springframework'@'localhost';
GRANT DELETE ON springguru.* to 'springframework'@'localhost';
GRANT UPDATE ON springguru.* to 'springframework'@'localhost';

GRANT SELECT ON springqa2.* to 'springgrasshopper'@'localhost';
GRANT INSERT ON springqa2.* to 'springgrasshopper'@'localhost';
GRANT DELETE ON springqa2.* to 'springgrasshopper'@'localhost';
GRANT UPDATE ON springqa2.* to 'springgrasshopper'@'localhost';