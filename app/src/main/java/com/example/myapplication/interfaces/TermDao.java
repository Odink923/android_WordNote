package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.models.Definition;
import com.example.myapplication.models.Picture;
import com.example.myapplication.models.Term;
import com.example.myapplication.models.Value;

import java.util.List;

@Dao
public interface TermDao {
    @Insert
    Long insert(Term obj);

    @Update
    void update(Term obj);

    @Delete
    void delete(Term obj);
    @Query("SELECT * FROM terms WHERE termId = :id")
    Term getTermById(Long id);
    @Query("SELECT terms.* FROM terms " +
            "INNER JOIN term_set ON terms.termId = term_set.termId " +
            "WHERE terms.userId = :userId")
    List<Term> getAllByUserId(Long userId);
//    @Query("SELECT * FROM terms WHERE termList = :str")//????
//    Term findByTerm(String str);
//    @Query("SELECT * FROM terms WHERE definitionList = :str")//????
//    Term findByDefinition(String str);

//    @Query("UPDATE terms SET definitionList = :newDefinitionList WHERE id = :termId")
//    void updateDefinitions(Long termId, List<Value> newDefinitionList);
//
//    @Query("UPDATE terms SET termList = :newTermList WHERE id = :termId")
//    void updateTerms(Long termId, List<Value> newTermList);
//
//    @Query("UPDATE terms SET pictureList = :newPictureList WHERE id = :termId")
//    void updateImages(Long termId, List<Picture> newPictureList);

    @Query("UPDATE terms SET selectElement = :newBoolean WHERE termId = :termId")
    void updateSelect(Long termId, Boolean newBoolean);

}