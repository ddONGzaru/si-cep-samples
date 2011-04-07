package org.opencredo.providers.common.service;

import org.opencredo.quote.domain.Car;
import org.opencredo.quote.domain.Person;
import org.opencredo.quote.domain.Quote;

public interface QuoteService {

    Quote createQuote(String providerName,Person applicant, Car car);
}
