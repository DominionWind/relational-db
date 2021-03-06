-- task 1

CREATE TABLE MOVIE
(
    ID NUMBER,
    CONSTRAINT MOVIE_ID PRIMARY KEY(ID),
    TITLE NVARCHAR2(50) NOT NULL UNIQUE,
    DIRECTOR NVARCHAR2(50) NOT NULL,
    YEAR NUMBER CHECK (YEAR BETWEEN 1900 AND 2018),
    LENGHT_MINS NUMBER CHECK (LENGHT_MINS BETWEEN 10 AND 200)
);

-- task 2

CREATE TABLE MOVIE_STAT
(
    MOVIE_ID NUMBER,
    CONSTRAINT MOVIE_STAT_MOVIE_ID PRIMARY KEY(MOVIE_ID),
    RATING DECIMAL (2,1),
    DOMESTIC_SALES NUMBER,
    INTERNATIONAL_SALES NUMBER
);

-- Select

Select * FROM movie;
Select * FROM movie_stat;

-- task 3

select DIRECTOR, count(ID) from Movie
group by DIRECTOR;

select DIRECTOR, sum(DOMESTIC_SALES), sum(INTERNATIONAL_SALES) from MOVIE, MOVIE_STAT
WHERE MOVIE_ID = MOVIE.ID
group by DIRECTOR;

-- task 4

SELECT * FROM MOVIE
ORDER BY YEAR DESC;

SELECT DIRECTOR, MAX(INTERNATIONAL_SALES) FROM MOVIE, MOVIE_STAT
WHERE MOVIE_ID = MOVIE.ID GROUP BY DIRECTOR ORDER BY MAX(INTERNATIONAL_SALES) DESC;

