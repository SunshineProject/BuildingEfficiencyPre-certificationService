--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.10
-- Dumped by pg_dump version 9.4.0
-- Started on 2016-02-11 10:54:01

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

SET search_path = map4data, pg_catalog;

SET default_with_oids = false;

--
-- TOC entry 321 (class 1259 OID 96892)
-- Name: trento; Type: TABLE; Schema: map4data; Owner: -
--

CREATE TABLE trento (
    gid integer NOT NULL,
    geom public.geometry(MultiPolygon,32632),
    date character varying(10),
    height_val double precision,
    m_use character varying(200),
    bdg_units integer,
    floors integer,
    refurbishm character varying(40),
    energy_perf character varying(2),
    heat_syst character varying(300),
    colore integer DEFAULT 0 NOT NULL,
    perf_value double precision,
    datetime timestamp without time zone,
    occupancy_level character varying(40),
    userlast character varying(80)
);


SET search_path = wfs_energy, pg_catalog;

--
-- TOC entry 459 (class 1259 OID 97457)
-- Name: trento; Type: TABLE; Schema: wfs_energy; Owner: -
--

CREATE TABLE trento (
    gid integer NOT NULL,
    geom public.geometry(MultiPolygon,32632),
    ave_floor double precision,
    bdg_units integer,
    begin integer,
    "end" integer,
    elev_value integer,
    elev_ref character varying(40),
    floors double precision,
    height_sta character varying(40),
    height_val double precision,
    refurbishm character varying(40),
    area double precision,
    perimeter double precision,
    per_comm double precision,
    typology character varying(4),
    residential boolean,
    u_roof double precision,
    u_floor double precision,
    p_win double precision,
    u_wall double precision,
    u_win double precision,
    delta_u double precision,
    irrad_hor integer,
    temp_avg double precision,
    heating_start integer,
    heating_end integer,
    comf_avg double precision,
    perf_value double precision,
    perf_value_top double precision,
    perf_value_cen double precision,
    perf_value_bas double precision,
    epi double precision,
    zone integer,
    pilot integer,
    datetime timestamp without time zone,
    classid character varying(70)
);


SET search_path = map4data, pg_catalog;

--
-- TOC entry 4774 (class 2606 OID 99291)
-- Name: trento_pkey; Type: CONSTRAINT; Schema: map4data; Owner: -
--

ALTER TABLE ONLY trento
    ADD CONSTRAINT trento_pkey PRIMARY KEY (gid);


SET search_path = wfs_energy, pg_catalog;

--
-- TOC entry 4776 (class 2606 OID 99439)
-- Name: trento_pkey1; Type: CONSTRAINT; Schema: wfs_energy; Owner: -
--

ALTER TABLE ONLY trento
    ADD CONSTRAINT trento_pkey1 PRIMARY KEY (gid);


SET search_path = map4data, pg_catalog;

--
-- TOC entry 4779 (class 2620 OID 99470)
-- Name: colora; Type: TRIGGER; Schema: map4data; Owner: -
--

CREATE TRIGGER colora BEFORE UPDATE ON trento FOR EACH ROW EXECUTE PROCEDURE public.update_color();


--
-- TOC entry 4780 (class 2620 OID 99474)
-- Name: update_modified; Type: TRIGGER; Schema: map4data; Owner: -
--

CREATE TRIGGER update_modified BEFORE UPDATE ON trento FOR EACH ROW EXECUTE PROCEDURE public.update_the_modified();


--
-- TOC entry 4781 (class 2620 OID 99481)
-- Name: update_timestemp; Type: TRIGGER; Schema: map4data; Owner: -
--

CREATE TRIGGER update_timestemp BEFORE UPDATE ON trento FOR EACH ROW EXECUTE PROCEDURE public.update_my_timestamp();


SET search_path = wfs_energy, pg_catalog;

--
-- TOC entry 4782 (class 2620 OID 99495)
-- Name: update_modified; Type: TRIGGER; Schema: wfs_energy; Owner: -
--

CREATE TRIGGER update_modified BEFORE UPDATE ON trento FOR EACH ROW EXECUTE PROCEDURE public.update_the_modified();


--
-- TOC entry 4783 (class 2620 OID 99505)
-- Name: update_timestemp; Type: TRIGGER; Schema: wfs_energy; Owner: -
--

CREATE TRIGGER update_timestemp BEFORE UPDATE ON trento FOR EACH ROW EXECUTE PROCEDURE public.update_my_timestamp();


SET search_path = map4data, pg_catalog;

--
-- TOC entry 4777 (class 2606 OID 99719)
-- Name: trento_gid_fkey; Type: FK CONSTRAINT; Schema: map4data; Owner: -
--

ALTER TABLE ONLY trento
    ADD CONSTRAINT trento_gid_fkey FOREIGN KEY (gid) REFERENCES trento_old.buildings(gid);


SET search_path = wfs_energy, pg_catalog;

--
-- TOC entry 4778 (class 2606 OID 99999)
-- Name: trento_gid_fkey1; Type: FK CONSTRAINT; Schema: wfs_energy; Owner: -
--

ALTER TABLE ONLY trento
    ADD CONSTRAINT trento_gid_fkey1 FOREIGN KEY (gid) REFERENCES trento.building(gid);


-- Completed on 2016-02-11 10:54:04

--
-- PostgreSQL database dump complete
--

