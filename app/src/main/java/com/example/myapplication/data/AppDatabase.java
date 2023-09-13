package com.example.myapplication.data;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.myapplication.DateConverter;
import com.example.myapplication.enums.AccessConverter;
import com.example.myapplication.interfaces.DefinitionDao;
import com.example.myapplication.interfaces.FolderDao;
import com.example.myapplication.interfaces.FolderWithSetsDao;
import com.example.myapplication.interfaces.LoginRecordDao;
import com.example.myapplication.interfaces.PictureDao;
import com.example.myapplication.interfaces.SetDao;
import com.example.myapplication.interfaces.SetFolderDao;
import com.example.myapplication.interfaces.SetWithFoldersDao;
import com.example.myapplication.interfaces.SetWithTermsDao;
import com.example.myapplication.interfaces.TermDao;
import com.example.myapplication.interfaces.TermDefinitionDao;
import com.example.myapplication.interfaces.TermPictureDao;
import com.example.myapplication.interfaces.TermSetDao;
import com.example.myapplication.interfaces.TermValueDao;
import com.example.myapplication.interfaces.TermWithDefinitionsDao;
import com.example.myapplication.interfaces.TermWithPicturesDao;
import com.example.myapplication.interfaces.TermWithSetsDao;
import com.example.myapplication.interfaces.TermWithValuesDao;
import com.example.myapplication.interfaces.UserDao;
import com.example.myapplication.interfaces.ValueDao;
import com.example.myapplication.models.Definition;
import com.example.myapplication.models.Folder;
import com.example.myapplication.models.FolderWithSets;
import com.example.myapplication.models.LoginRecord;
import com.example.myapplication.models.Picture;
import com.example.myapplication.models.Set;
import com.example.myapplication.models.SetFolder;
import com.example.myapplication.models.SetWithFolders;
import com.example.myapplication.models.SetWithTerms;
import com.example.myapplication.models.Term;
import com.example.myapplication.models.TermDefinition;
import com.example.myapplication.models.TermPicture;
import com.example.myapplication.models.TermSet;
import com.example.myapplication.models.TermValue;
import com.example.myapplication.models.TermWithDefinition;
import com.example.myapplication.models.TermWithPictures;
import com.example.myapplication.models.TermWithSets;
import com.example.myapplication.models.TermWithValues;
import com.example.myapplication.models.User;
import com.example.myapplication.models.UserWithFolders;
import com.example.myapplication.models.UserWithLoginRecord;
import com.example.myapplication.models.UserWithSets;
import com.example.myapplication.models.UserWithTerms;
import com.example.myapplication.models.Value;

@Database(entities = {Term.class, Folder.class, LoginRecord.class, Picture.class, Set.class,
        SetFolder.class, TermPicture.class, TermSet.class, User.class, Value.class, TermValue.class,
        Definition.class, TermDefinition.class}, views = {SetWithFolders.class, SetWithTerms.class,
        TermWithDefinition.class, TermWithPictures.class, TermWithSets.class, TermWithValues.class,
        UserWithTerms.class, UserWithSets.class, UserWithFolders.class, UserWithLoginRecord.class, FolderWithSets.class}, version = 1, exportSchema = false)
@TypeConverters({AccessConverter.class, DateConverter.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract TermDao termDao();
    public abstract FolderDao folderDao();
    public abstract LoginRecordDao loginRecordDao ();
    public abstract PictureDao pictureDao();
    public abstract SetDao setDao();
    public abstract SetFolderDao setFolderDao();
    public abstract TermPictureDao termPictureDao();
    public abstract TermSetDao termSetDao();
    public abstract UserDao userDao();
    public abstract ValueDao valueDao();
    public abstract TermValueDao termValueDao();
    public abstract DefinitionDao definitionDao();
    public abstract TermDefinitionDao termDefinitionDao();
    public abstract SetWithTermsDao setWithTermsDao();
    public abstract SetWithFoldersDao setWithFoldersDao();
    public abstract TermWithDefinitionsDao termWithDefinitionsDao();
    public abstract TermWithPicturesDao termWithPicturesDao();
    public abstract TermWithSetsDao termWithSetsDao();
    public abstract TermWithValuesDao termWithValuesDao();
    public abstract FolderWithSetsDao folderWithSetsDao();
}
