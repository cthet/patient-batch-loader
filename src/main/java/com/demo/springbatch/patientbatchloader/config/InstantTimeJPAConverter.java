package com.demo.springbatch.patientbatchloader.config;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.sql.Timestamp;
import java.time.Instant;

/**
 * Converter for supporting new time apis with H2. Provides conversion between
 * Instant and Timestamp.
 */
@Converter(autoApply = true)
public class InstantTimeJPAConverter implements AttributeConverter<Instant, Timestamp> {

	@Override
	public Timestamp convertToDatabaseColumn(Instant instant) {
		return (instant == null ? null : Timestamp.from(instant));
	}

	@Override
	public Instant convertToEntityAttribute(Timestamp timestamp) {
		return (timestamp == null ? null : timestamp.toInstant());
	}

}
