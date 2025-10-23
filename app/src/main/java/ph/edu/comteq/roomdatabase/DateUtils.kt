package ph.edu.comteq.roomdatabase

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


object DateUtils {
    private val dateFormat = SimpleDateFormat("MMM dd, yyyy", Locale.getDefault())
    private val timeFormat = SimpleDateFormat("h:mm a", Locale.getDefault())
    private val datetimeFormat =
        SimpleDateFormat("MMM dd, yyyy h:mm a", Locale.getDefault())

    fun formatDate (timestamp: Long): String{
        return dateFormat.format(Date(timestamp))
    }
    fun formateTime (timestamp: Long): String{
        return timeFormat.format(Date(timestamp))
    }
    fun formatDateTime(timestamp: Long) : String{
        return datetimeFormat.format(Date(timestamp))
    }
}