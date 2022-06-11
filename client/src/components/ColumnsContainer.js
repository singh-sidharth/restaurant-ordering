import React from 'react';
import {Col, Container, Row} from "react-bootstrap";

export default function ColumnsContainer() {
    return (
        <Container className='mt-4'>
            <Row className='text-center'>
                <Col>
                    <h2>But in all seriousness</h2>
                </Col>
            </Row>
            <Row className='mt-3 text-left h-auto mb-4'>
                <Col className='mx-auto' md={5}>
                    <p>We really do pride ourselves in being providing customers with the 
                        most elite experience of fine dining possible. We've got chefs 
                        with all the skills to compliment each other, and more importantly,
                        carry the passion to serve meals that are nothing short of spectacular.
                    </p>
                </Col>

                <Col className='mx-auto' md={5}>
                    <p>We firmly belive that good food goes a long way, and can very easily be called 
                        one of life's simplest joys. The aim to strive to be the very best, that no 
                        one ever was, in providing such pleasures to anyone who walks through our doors.
                        I think we've now exhausted our vocabulary here, whew!
                    </p>
                </Col>
            </Row>
        </Container>
    );
}