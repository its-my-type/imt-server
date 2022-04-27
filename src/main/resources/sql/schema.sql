
CREATE TABLE IF NOT EXISTS celebrities (
    celebrity_id INTEGER NOT NULL PRIMARY KEY auto_increment,
    name VARCHAR (40),
    gender CHAR (6),
    birth INTEGER (6)
);

CREATE TABLE IF NOT EXISTS images (
    image_name VARCHAR (30) NOT NULL PRIMARY KEY,
    feature text NOT NULL,
    celebrity_id INTEGER,
    FOREIGN KEY (celebrity_id) REFERENCES celebrities(celebrity_id) ON DELETE SET NULL
);
