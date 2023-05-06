create table palavras(
    id int primary key auto_increment,
    palavra varchar(100) not null,
    significado varchar(500) not null
);

insert into palavras (palavra, significado) values
('Apatico', 'Indiferente, Insensivel'),
('Compreensao','Entender, entendimento'),
('Altruismo', 'Ausencia de egoismo'),
('Soronidade', 'Irmandade, Empatia'),
('hermetico','Perfeitamente, totalmente fechado');