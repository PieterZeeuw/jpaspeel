# Getting Started

### Reference Documentation
Probleem:
Twee tabellen Person (owner) en Adres (child).

Ik wil een unidirectional one-to-one leggen vanuit de owner naar child.
Hierbij moet de foreign key in de adres tabel zijn opgenomen.

Het is eigenlijk precies hetzelfde als een many-to-one, maar dan als one-to-one.


Probleem is als je de relatie vast legt zoals die nu in de entities staat (Dit is een bidirectional relatie trouwens,
was gemakkelijker), dan neemt ie bij het persisten van een Person (met adres) de foreign key niet mee.
Bij een manyToOne zie je in de logging netjes een update voor de FK als beide entiteiten ge-insert zijn, maar bij 
een OneToOne dus niet..

Probeer maar uit: Post request hieronder uitvoeren, en vervolgens het get request. Adres komt dan niet mee.
Als je in de DB kijkt zie je ook dat personId in Adres niet gezet is.

Succes! ;)

### POST Request example
POST http://localhost:8080/api/personen
Content-Type: application/json

{
"firstName": "Blaat",
"lastName": "Test",
"dateOfBirth": "01-01-1999",
"adresEntity": {
"zipCode": "1234AB",
"streetName": "Een Straat",
"houseNumber": 1
}
}

### GET Example
GET http://localhost:8080/api/personen

### H2
http://localhost:8080/h2
