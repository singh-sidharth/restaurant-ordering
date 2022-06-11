import React from 'react';
import {Col, Row} from "react-bootstrap";
import Jumbotron from "react-bootstrap/Jumbotron";
import Container from "react-bootstrap/Container";

export default function Footer() {
    return (
        <Jumbotron className='text-left text-light bg-dark mb-0 mt-5 font-footer p-4'>
            <Container>
                <Row>
                    <Col xs={7} sm={8} className='border-right'>
                        <p className='text-uppercase'>Absolutely Real Locations:</p>
                        <Row className='text-capitalize'>
                            <Col lg={3}>
                                <p>Generic ABC Street Name,
                                    Generic Locality,
                                    Your country.
                                </p>
                            </Col>
                            <Col lg={3}>
                                <p>Unsuspicious Lane,
                                    Very safe District,
                                     3rd World Country.
                                </p>
                            </Col>
                            <Col lg={3}>
                                <p>Confusing Street,
                                    Unknown Avenue,
                                     City you hate.
                                </p>
                            </Col>
                        </Row>

                    </Col>
                    <Col>
                        <Col>
                            <p className='text-uppercase'>Hours</p>
                            <p>Monday — Thursday
                                <p>8am — 11pm </p>
                            </p>

                            <p>
                                Friday — Sunday
                                <p>Kahin aur party karo</p>
                            </p>
                        </Col>
                    </Col>
                </Row>
            </Container>

        </Jumbotron>
    );
}