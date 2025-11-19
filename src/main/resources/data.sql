INSERT INTO users (name, email, password, has_mobility_issue, access)
VALUES ('Pedro', 'pedro@gmail.com', '2702cb34ee041711b9df0c67a8d5c9de02110c80e3fc966ba8341456dbc9ef2b', true, 'user');
INSERT INTO users (name, email, password, has_mobility_issue, access)
VALUES ('Lucas Sobral', 'sobral@gmail.com', 'f1bd4bec0572a9a2e13fa79e28960a48805df025dd3a5e66bc185428ade224c2', false, 'admin');

INSERT INTO users (name, email, password, has_mobility_issue, access)
VALUES ('João Souza', 'joao@gmail.com', '8681d505cb1b0344d0c7aa3c0e655c7e3a5add0f0960c1d142070a64cacab031', false, 'user');

INSERT INTO stations (name, temperature, crowd_level, elevator_status, overall_status, updated_at)
VALUES
    ('Estação Paulista', '22°C', 30, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP),

    ('Estação Sé', '25°C', 85, 'BROKEN', 'INADEQUADO', CURRENT_TIMESTAMP),

    ('Estação Vila Mariana', '21°C', 10, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP),

    ('Estação Pinheiros', '24°C', 65, 'OPERATING', 'INADEQUADO', CURRENT_TIMESTAMP),

    ('Estação Tatuapé', '26°C', 90, 'BROKEN', 'INADEQUADO', CURRENT_TIMESTAMP),

    ('Estação Consolação', '23°C', 50, 'OPERATING', 'INADEQUADO', CURRENT_TIMESTAMP),

    ('Estação Jabaquara', '20°C', 15, 'OPERATING', 'ADEQUADO', CURRENT_TIMESTAMP);


