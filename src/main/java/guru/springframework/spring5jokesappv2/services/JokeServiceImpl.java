package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 *  Created by DS on 10/10/24
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }
    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
