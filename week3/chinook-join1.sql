SET SCHEMA 'chinook';

-- find all tracks that belong to an album which has the same name as the artist
SELECT * FROM artist
INNER JOIN album
ON (artist.name = album.title)
INNER JOIN track
ON (track.albumid = album.albumid);

