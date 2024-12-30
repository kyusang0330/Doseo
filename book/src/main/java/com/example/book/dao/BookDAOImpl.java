package com.example.book.dao;

import com.example.book.entity.Book;
import com.example.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookDAOImpl implements BookDAO {
    private final BookRepository bookRepository;
    @Override
    public void insert(Book book) {
        bookRepository.save(book);
    }
    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Rent not found"));
    }
    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }
    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}

//package miniproject.carrotmarket1.dao;
//
//import lombok.RequiredArgsConstructor;
//import miniproject.carrotmarket1.entity.Report;
//import miniproject.carrotmarket1.repository.ReportRepository;
//import miniproject.carrotmarket1.repository.ReportSpecification;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class ReportDAO {
//
//    private final ReportRepository reportRepository;
//
//    public Page<Report> getReportListPagination(String startDate,
//                                                String endDate,
//                                                String status,
//                                                Pageable pageable,
//                                                String tag,
//                                                String search) {
//        return reportRepository.findAll(
//                ReportSpecification.filterReports(startDate, endDate, status, tag, search),
//                pageable
//        );
//    }
//}

