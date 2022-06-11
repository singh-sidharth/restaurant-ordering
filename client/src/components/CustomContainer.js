import React from 'react';
import {Col, Container, Row} from "react-bootstrap";

export default function CustomContainer() {
    return (
        <Container className='h-auto my-4 pt-3'>
            <Row className='h-100'>
                <Col className="text-center m-auto">
                    <h2 className='text-uppercase'>Yours Truly</h2>
                    <p className='m-auto w-75 pb-lg-5'>Please pretend to be impressed by the audacious use of seemingly
                    impactful words thrown in here to seem like we have any clue of what we're supposed to be doing here.
                    </p>
                </Col>
            </Row>
        </Container>
    );
}