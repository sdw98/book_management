package com.sdw.book_management.service;

import com.sdw.book_management.model.Author;
import com.sdw.book_management.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;

    public Author create(Author author) {
        return authorRepository.save(author);
    }
}
