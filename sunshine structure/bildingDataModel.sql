--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.10
-- Dumped by pg_dump version 9.4.0
-- Started on 2016-02-11 11:11:13

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 32 (class 2615 OID 96131)
-- Name: <CITY-NAME>; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA <CITY-NAME>;


SET search_path = <CITY-NAME>, pg_catalog;

SET default_with_oids = false;

--
-- TOC entry 421 (class 1259 OID 97299)
-- Name: building; Type: TABLE; Schema: <CITY-NAME>; Owner: -
--

CREATE TABLE building (
    gid integer NOT NULL,
    geom public.geometry(MultiPolygon,32632),
    classid character varying(70),
    name character varying(50),
    nature public.buildingnaturevalue,
    begin integer DEFAULT 0,
    "end" integer DEFAULT 0,
    refurbishm public.refurbishmentlevel,
    height_val double precision,
    height_sta public.heightstatusvalue,
    height_ref public.elevationreference,
    elev_val double precision,
    elev_ref public.elevationreference,
    elev_dat integer,
    ave_floor_h double precision,
    floors integer,
    bdg_units integer,
    occ_level public.uselevel,
    heat_vol double precision,
    perimeter double precision,
    per_common double precision,
    typology public.residentialtypology,
    asses_type public.energyassessment DEFAULT 'typological'::public.energyassessment NOT NULL,
    temp_uri text,
    temp_avg double precision,
    irrad_uri text,
    irrad_hor double precision,
    irrad_n double precision,
    irrad_s double precision,
    irrad_e double precision,
    irrad_w double precision,
    u_wall double precision,
    u_roof double precision,
    u_floor double precision,
    u_win double precision,
    delta_u double precision,
    p_win integer,
    mat_wall character varying(80),
    den_wall double precision,
    sp_heat_wall double precision,
    therm_cond_wall double precision,
    mat_roof character varying(50),
    mat_floor character varying(50),
    foiid bigint,
    temp_output_uri text,
    onof_output_uri text,
    average_occupants double precision,
    heat_flow_occupants double precision,
    CONSTRAINT building_p_win_check CHECK ((p_win >= 0))
);


--
-- TOC entry 422 (class 1259 OID 97309)
-- Name: building_gid_seq; Type: SEQUENCE; Schema: <CITY-NAME>; Owner: -
--

CREATE SEQUENCE building_gid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 4968 (class 0 OID 0)
-- Dependencies: 422
-- Name: building_gid_seq; Type: SEQUENCE OWNED BY; Schema: <CITY-NAME>; Owner: -
--

ALTER SEQUENCE building_gid_seq OWNED BY building.gid;


--
-- TOC entry 423 (class 1259 OID 97311)
-- Name: currentuse; Type: TABLE; Schema: <CITY-NAME>; Owner: -
--

CREATE TABLE currentuse (
    id integer NOT NULL,
    id_building integer,
    use_value public.currentusevalue,
    percentage integer,
    CONSTRAINT currentuse_percentage_check CHECK ((percentage >= 0))
);


--
-- TOC entry 424 (class 1259 OID 97315)
-- Name: currentuse_id_seq; Type: SEQUENCE; Schema: <CITY-NAME>; Owner: -
--

CREATE SEQUENCE currentuse_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 4969 (class 0 OID 0)
-- Dependencies: 424
-- Name: currentuse_id_seq; Type: SEQUENCE OWNED BY; Schema: <CITY-NAME>; Owner: -
--

ALTER SEQUENCE currentuse_id_seq OWNED BY currentuse.id;


--
-- TOC entry 425 (class 1259 OID 97317)
-- Name: energyamount; Type: TABLE; Schema: <CITY-NAME>; Owner: -
--

CREATE TABLE energyamount (
    id integer NOT NULL,
    id_thermalzone integer,
    e_source public.energysourcevalue,
    e_type public.energytype NOT NULL,
    e_use public.energyuse,
    e_amount double precision,
    e_uri public.energymesureunit,
    e_uom character varying(50),
    e_cost double precision,
    e_cur character varying(3),
    e_year integer,
    e_perc integer
);


--
-- TOC entry 426 (class 1259 OID 97320)
-- Name: energyamount_id_seq; Type: SEQUENCE; Schema: <CITY-NAME>; Owner: -
--

CREATE SEQUENCE energyamount_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 4970 (class 0 OID 0)
-- Dependencies: 426
-- Name: energyamount_id_seq; Type: SEQUENCE OWNED BY; Schema: <CITY-NAME>; Owner: -
--

ALTER SEQUENCE energyamount_id_seq OWNED BY energyamount.id;


--
-- TOC entry 427 (class 1259 OID 97322)
-- Name: heatingsystem; Type: TABLE; Schema: <CITY-NAME>; Owner: -
--

CREATE TABLE heatingsystem (
    id integer NOT NULL,
    id_thermalzone integer,
    heat_syst public.heatingsystemvalue NOT NULL,
    heat_eff double precision,
    heat_ctr public.heatingcontrols
);


--
-- TOC entry 428 (class 1259 OID 97325)
-- Name: heatingsystem_id_seq; Type: SEQUENCE; Schema: <CITY-NAME>; Owner: -
--

CREATE SEQUENCE heatingsystem_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 4971 (class 0 OID 0)
-- Dependencies: 428
-- Name: heatingsystem_id_seq; Type: SEQUENCE OWNED BY; Schema: <CITY-NAME>; Owner: -
--

ALTER SEQUENCE heatingsystem_id_seq OWNED BY heatingsystem.id;


--
-- TOC entry 429 (class 1259 OID 97327)
-- Name: officialarea; Type: TABLE; Schema: <CITY-NAME>; Owner: -
--

CREATE TABLE officialarea (
    id integer NOT NULL,
    id_building integer,
    clge_value double precision,
    area_ref public.officialarearefvalue,
    CONSTRAINT officialarea_clge_value_check CHECK ((clge_value >= (0)::double precision))
);


--
-- TOC entry 430 (class 1259 OID 97331)
-- Name: officialarea_id_seq; Type: SEQUENCE; Schema: <CITY-NAME>; Owner: -
--

CREATE SEQUENCE officialarea_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 4972 (class 0 OID 0)
-- Dependencies: 430
-- Name: officialarea_id_seq; Type: SEQUENCE OWNED BY; Schema: <CITY-NAME>; Owner: -
--

ALTER SEQUENCE officialarea_id_seq OWNED BY officialarea.id;


--
-- TOC entry 431 (class 1259 OID 97333)
-- Name: systeminformation; Type: TABLE; Schema: <CITY-NAME>; Owner: -
--

CREATE TABLE systeminformation (
    id_building integer NOT NULL,
    lastmodified timestamp without time zone,
    "time" timestamp without time zone,
    lastmodifier public.buildingmodifier
);


--
-- TOC entry 432 (class 1259 OID 97336)
-- Name: thermalzone; Type: TABLE; Schema: <CITY-NAME>; Owner: -
--

CREATE TABLE thermalzone (
    id integer NOT NULL,
    id_building integer,
    therm_typ public.zonetype NOT NULL,
    validation boolean DEFAULT false NOT NULL,
    heat_start integer,
    heat_end integer,
    comf_uri text,
    comf_avg double precision,
    perf_method character varying(50),
    perf_date integer,
    perf_value double precision,
    perf_value_top double precision,
    perf_value_cen double precision,
    perf_value_bas double precision,
    perf_uom character varying(40),
    perf_class public.energyperformancevalue,
    corr_temp_cons character varying(50)
);


--
-- TOC entry 433 (class 1259 OID 97343)
-- Name: thermalzone_id_seq; Type: SEQUENCE; Schema: <CITY-NAME>; Owner: -
--

CREATE SEQUENCE thermalzone_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 4973 (class 0 OID 0)
-- Dependencies: 433
-- Name: thermalzone_id_seq; Type: SEQUENCE OWNED BY; Schema: <CITY-NAME>; Owner: -
--

ALTER SEQUENCE thermalzone_id_seq OWNED BY thermalzone.id;


--
-- TOC entry 4782 (class 2604 OID 97532)
-- Name: gid; Type: DEFAULT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY building ALTER COLUMN gid SET DEFAULT nextval('building_gid_seq'::regclass);


--
-- TOC entry 4784 (class 2604 OID 97533)
-- Name: id; Type: DEFAULT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY currentuse ALTER COLUMN id SET DEFAULT nextval('currentuse_id_seq'::regclass);


--
-- TOC entry 4786 (class 2604 OID 97534)
-- Name: id; Type: DEFAULT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY energyamount ALTER COLUMN id SET DEFAULT nextval('energyamount_id_seq'::regclass);


--
-- TOC entry 4787 (class 2604 OID 97535)
-- Name: id; Type: DEFAULT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY heatingsystem ALTER COLUMN id SET DEFAULT nextval('heatingsystem_id_seq'::regclass);


--
-- TOC entry 4788 (class 2604 OID 97536)
-- Name: id; Type: DEFAULT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY officialarea ALTER COLUMN id SET DEFAULT nextval('officialarea_id_seq'::regclass);


--
-- TOC entry 4791 (class 2604 OID 97537)
-- Name: id; Type: DEFAULT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY thermalzone ALTER COLUMN id SET DEFAULT nextval('thermalzone_id_seq'::regclass);


--
-- TOC entry 4793 (class 2606 OID 99397)
-- Name: building_pkey; Type: CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY building
    ADD CONSTRAINT building_pkey PRIMARY KEY (gid);


--
-- TOC entry 4795 (class 2606 OID 99399)
-- Name: currentuse_id_building_use_value_key; Type: CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY currentuse
    ADD CONSTRAINT currentuse_id_building_use_value_key UNIQUE (id_building, use_value);


--
-- TOC entry 4797 (class 2606 OID 99401)
-- Name: currentuse_pkey; Type: CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY currentuse
    ADD CONSTRAINT currentuse_pkey PRIMARY KEY (id);


--
-- TOC entry 4799 (class 2606 OID 99403)
-- Name: energyamount_pkey; Type: CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY energyamount
    ADD CONSTRAINT energyamount_pkey PRIMARY KEY (id);


--
-- TOC entry 4801 (class 2606 OID 99405)
-- Name: heatingsystem_pkey; Type: CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY heatingsystem
    ADD CONSTRAINT heatingsystem_pkey PRIMARY KEY (id);


--
-- TOC entry 4803 (class 2606 OID 99407)
-- Name: officialarea_id_building_area_ref_key; Type: CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY officialarea
    ADD CONSTRAINT officialarea_id_building_area_ref_key UNIQUE (id_building, area_ref);


--
-- TOC entry 4805 (class 2606 OID 99409)
-- Name: officialarea_pkey; Type: CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY officialarea
    ADD CONSTRAINT officialarea_pkey PRIMARY KEY (id);


--
-- TOC entry 4807 (class 2606 OID 99411)
-- Name: systeminformation_pkey; Type: CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY systeminformation
    ADD CONSTRAINT systeminformation_pkey PRIMARY KEY (id_building);


--
-- TOC entry 4809 (class 2606 OID 99413)
-- Name: thermalzone_pkey; Type: CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY thermalzone
    ADD CONSTRAINT thermalzone_pkey PRIMARY KEY (id);


--
-- TOC entry 4812 (class 2606 OID 4381577)
-- Name: buildings_material_of_stru_fk1; Type: FK CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY building
    ADD CONSTRAINT buildings_material_of_stru_fk1 FOREIGN KEY (mat_wall) REFERENCES configurations.d_material_value(code);


--
-- TOC entry 4811 (class 2606 OID 4381582)
-- Name: buildings_material_of_stru_fk2; Type: FK CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY building
    ADD CONSTRAINT buildings_material_of_stru_fk2 FOREIGN KEY (mat_floor) REFERENCES configurations.d_material_value(code);


--
-- TOC entry 4810 (class 2606 OID 4381587)
-- Name: buildings_material_of_stru_fk3; Type: FK CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY building
    ADD CONSTRAINT buildings_material_of_stru_fk3 FOREIGN KEY (mat_roof) REFERENCES configurations.d_material_value(code);


--
-- TOC entry 4813 (class 2606 OID 99889)
-- Name: currentuse_id_building_fkey; Type: FK CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY currentuse
    ADD CONSTRAINT currentuse_id_building_fkey FOREIGN KEY (id_building) REFERENCES building(gid);


--
-- TOC entry 4814 (class 2606 OID 99894)
-- Name: energyamount_id_thermalzone_fkey; Type: FK CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY energyamount
    ADD CONSTRAINT energyamount_id_thermalzone_fkey FOREIGN KEY (id_thermalzone) REFERENCES thermalzone(id);


--
-- TOC entry 4815 (class 2606 OID 99899)
-- Name: heatingsystem_id_thermalzone_fkey; Type: FK CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY heatingsystem
    ADD CONSTRAINT heatingsystem_id_thermalzone_fkey FOREIGN KEY (id_thermalzone) REFERENCES thermalzone(id);


--
-- TOC entry 4816 (class 2606 OID 99904)
-- Name: officialarea_id_building_fkey; Type: FK CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY officialarea
    ADD CONSTRAINT officialarea_id_building_fkey FOREIGN KEY (id_building) REFERENCES building(gid);


--
-- TOC entry 4817 (class 2606 OID 99909)
-- Name: systeminformation_id_building_fkey; Type: FK CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY systeminformation
    ADD CONSTRAINT systeminformation_id_building_fkey FOREIGN KEY (id_building) REFERENCES building(gid);


--
-- TOC entry 4818 (class 2606 OID 99914)
-- Name: thermalzone_id_building_fkey; Type: FK CONSTRAINT; Schema: <CITY-NAME>; Owner: -
--

ALTER TABLE ONLY thermalzone
    ADD CONSTRAINT thermalzone_id_building_fkey FOREIGN KEY (id_building) REFERENCES building(gid);


-- Completed on 2016-02-11 11:11:26

--
-- PostgreSQL database dump complete
--

