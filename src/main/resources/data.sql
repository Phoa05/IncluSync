INSERT INTO users (name, email, password, has_mobility_issue, access)
VALUES ('Pedro', 'pedro@gmail.com', '2702cb34ee041711b9df0c67a8d5c9de02110c80e3fc966ba8341456dbc9ef2b', true, 'user');
INSERT INTO users (name, email, password, has_mobility_issue, access)
VALUES ('Lucas Sobral', 'sobral@gmail.com', 'f1bd4bec0572a9a2e13fa79e28960a48805df025dd3a5e66bc185428ade224c2', false, 'admin');

INSERT INTO users (name, email, password, has_mobility_issue, access)
VALUES ('João Souza', 'joao@gmail.com', '8681d505cb1b0344d0c7aa3c0e655c7e3a5add0f0960c1d142070a64cacab031', false, 'user');

INSERT INTO stations (name, temperature, crowd_level, elevator_status, overall_status, updated_at, line, connections)
VALUES
    -- Linha 1 – Azul
    ('Jabaquara', '20°C', 15, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('Conceição', '20°C', 10, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('São Judas', '20°C', 12, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('Saúde', '21°C', 20, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('Praça da Árvore', '21°C', 25, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('Santa Cruz', '22°C', 30, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '["5-Lilás"]'),  -- baldeação com Lilás :contentReference[oaicite:0]{index=0}
    ('Vila Mariana', '21°C', 18, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('Ana Rosa', '22°C', 40, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '["2-Verde"]'),  -- baldeação com Verde :contentReference[oaicite:1]{index=1}
    ('Paraíso', '23°C', 35, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '["2-Verde"]'),
    ('Vergueiro', '21°C', 15, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('São Joaquim', '21°C', 10, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('Japão-Liberdade', '23°C', 20, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('Sé', '25°C', 85, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '["3-Vermelha"]'),  -- grande baldeação :contentReference[oaicite:2]{index=2}
    ('São Bento', '22°C', 18, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('Luz', '24°C', 70, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '["4-Amarela"]'),
    ('Tiradentes', '21°C', 12, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('Armênia', '21°C', 10, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('Portuguesa-Tietê', '20°C', 8, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('Carandiru', '20°C', 15, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('Jardim São Paulo – Ayrton Senna', '21°C', 13, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('Parada Inglesa', '21°C', 12, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('Santana', '22°C', 25, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),
    ('Tucuruvi', '22°C', 30, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '1-Azul', '[]'),

    -- Linha 2 – Verde
    ('Vila Madalena', '21°C', 20, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '2-Verde', '[]'),
    ('Sumaré – Santuário Nossa Senhora de Fátima', '21°C', 10, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '2-Verde', '[]'),
    ('Clínicas', '22°C', 12, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '2-Verde', '[]'),
    ('Consolação', '23°C', 40, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '2-Verde', '["4-Amarela"]'),
    ('Trianon – MASP', '22°C', 35, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '2-Verde', '[]'),
    ('Brigadeiro', '24°C', 30, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '2-Verde', '[]'),
    ('Paraíso', '25°C', 35, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '2-Verde', '["1-Azul"]'),
    ('Ana Rosa', '22°C', 40, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '2-Verde', '["1-Azul"]'),
    ('Chácara Klabin', '24°C', 25, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '2-Verde', '["5-Lilás"]'),
    ('Santos-Imigrantes', '22°C', 15, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '2-Verde', '[]'),
    ('Alto do Ipiranga', '23°C', 20, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '2-Verde', '[]'),
    ('Sacomã', '23°C', 18, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '2-Verde', '[]'),
    ('Tamanduateí', '24°C', 22, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '2-Verde', '[]'),
    ('Vila Prudente', '24°C', 30, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '2-Verde', '["15-Prata"]'),

    -- Linha 3 – Vermelha
    ('Corinthians–Itaquera', '25°C', 40, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),
    ('Artur Alvim', '24°C', 20, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),
    ('Patriarca–Vila Ré', '24°C', 18, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),
    ('Guilhermina–Esperança', '23°C', 15, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),
    ('Vila Matilde', '24°C', 22, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),
    ('Penha', '24°C', 25, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),
    ('Carrão', '24°C', 20, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),
    ('Tatuapé', '25°C', 45, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),
    ('Belém', '24°C', 20, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),
    ('Bresser–Moóca', '23°C', 15, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),
    ('Brás', '24°C', 30, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),
    ('Pedro II', '23°C', 12, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),
    ('Sé', '25°C', 85, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '["1-Azul"]'),
    ('Anhangabaú', '24°C', 10, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),
    ('República', '24°C', 50, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '["4-Amarela"]'),
    ('Santa Cecília', '23°C', 10, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),
    ('Marechal Deodoro', '23°C', 12, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),
    ('Palmeiras–Barra Funda', '24°C', 30, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '3-Vermelha', '[]'),

    -- Linha 4 – Amarela
    ('Vila Sônia', '22°C', 10, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '4-Amarela', '[]'),
    ('São Paulo – Morumbi', '22°C', 15, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '4-Amarela', '[]'),
    ('Butantã', '22°C', 12, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '4-Amarela', '[]'),
    ('Pinheiros', '24°C', 65, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '4-Amarela', '["9-Esmeralda"]'),  -- se você tivesse linha 9 no seu sistema
    ('Faria Lima', '23°C', 30, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '4-Amarela', '[]'),
    ('Fradique Coutinho', '23°C', 20, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '4-Amarela', '[]'),
    ('Oscar Freire', '22°C', 15, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '4-Amarela', '[]'),
    ('Paulista – Pernambucanas', '24°C', 50, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '4-Amarela', '["2-Verde"]'),
    ('Higienópolis – Mackenzie', '23°C', 20, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '4-Amarela', '[]'),
    ('República', '24°C', 50, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '4-Amarela', '["3-Vermelha"]'),
    ('Luz', '24°C', 70, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '4-Amarela', '["1-Azul"]'),

    -- Linha 5 – Lilás
    ('Capão Redondo', '22°C', 12, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '[]'),
    ('Campo Limpo', '22°C', 15, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '[]'),
    ('Vila das Belezas', '23°C', 10, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '[]'),
    ('Giovanni Gronchi', '23°C', 12, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '[]'),
    ('Santo Amaro', '24°C', 30, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '[]'),
    ('Largo Treze', '23°C', 15, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '[]'),
    ('Adolfo Pinheiro', '22°C', 10, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '[]'),
    ('Alto da Boa Vista', '22°C', 12, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '[]'),
    ('Borba Gato', '23°C', 10, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '[]'),
    ('Brooklin', '23°C', 20, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '[]'),
    ('Campo Belo', '23°C', 18, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '[]'),
    ('Eucaliptos', '22°C', 12, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '[]'),
    ('Moema', '23°C', 15, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '[]'),
    ('AACD-Servidor', '22°C', 10, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '[]'),
    ('Hospital São Paulo', '22°C', 12, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '[]'),
    ('Santa Cruz', '22°C', 30, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '["1-Azul"]'),
    ('Chácara Klabin', '23°C', 25, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '5-Lilás', '["2-Verde"]'),

    -- Linha 15 – Prata (Monotrilho)
    ('Jardim Colonial', '24°C', 20, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '15-Prata', '[]'),
    ('São Mateus', '24°C', 25, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '15-Prata', '[]'),
    ('Fazenda da Juta', '24°C', 18, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '15-Prata', '[]'),
    ('Sapopemba', '25°C', 22, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '15-Prata', '[]'),
    ('Jardim Planalto', '24°C', 20, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '15-Prata', '[]'),
    ('Vila União', '24°C', 18, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '15-Prata', '[]'),
    ('Vila Tolstói', '24°C', 15, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '15-Prata', '[]'),
    ('Camilo Haddad', '23°C', 12, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '15-Prata', '[]'),
    ('São Lucas', '23°C', 15, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '15-Prata', '[]'),
    ('Oratório', '24°C', 20, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '15-Prata', '[]'),
    ('Vila Prudente', '24°C', 30, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP, '15-Prata', '["2-Verde"]');




