package ph.edu.comteq.roomdatabase

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

/**
 * * This class represents a note with all associated tags
 * */

data class NoteWithTags(
    @Embedded
    val note: Note,

    @Relation(
        parentColumn = "id", //Note's id
        entityColumn = "id", //Tag's id
        associateBy = Junction(
            value = NoteTagCrossRef::class,
            parentColumn = "noteId",
            entityColumn = "tagId"
        )
    )

    val tags:List<Tag>
)
