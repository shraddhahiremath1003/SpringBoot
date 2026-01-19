-- =========================
-- INSURANCE TABLE DATA
-- =========================
INSERT INTO insurance (
    id,
    policy_number,
    provider,
    valid_until,
    created_at
) VALUES
(1, 'POL-INS-001', 'LIC India', '2030-12-31', CURRENT_TIMESTAMP),
(2, 'POL-INS-002', 'HDFC Ergo', '2028-06-30', CURRENT_TIMESTAMP),
(3, 'POL-INS-003', 'Star Health', '2027-03-31', CURRENT_TIMESTAMP);


-- =========================
-- PATIENT TABLE DATA
-- =========================
INSERT INTO patient (
    id,
    name,
    birth_date,
    email,
    gender,
    created_at,
    blood_group,
    patient_insurance_id
) VALUES
(1, 'Aarav Sharma', '1995-05-10', 'aarav@example.com', 'MALE',
 CURRENT_TIMESTAMP, 'O_POSITIVE', 1),

(2, 'Diya Patel', '1998-08-20', 'diya@example.com', 'FEMALE',
 CURRENT_TIMESTAMP, 'A_POSITIVE', 2),

(3, 'Kabir Singh', '1992-03-15', 'kabir@example.com', 'MALE',
 CURRENT_TIMESTAMP, 'B_POSITIVE', 3);
