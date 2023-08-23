import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arifin.bangkitproject1.DetailHero
import com.arifin.bangkitproject1.ItemModel
import com.arifin.bangkitproject1.R
import com.arifin.bangkitproject1.databinding.ItemBinding

class ItemAdapter(private val context: Context, private val itemList: List<ItemModel>) :
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ItemModel) {
            binding.img.setImageResource(item.imageResource)
            binding.title.text = item.title
            binding.description.text = item.description

            binding.root.setOnClickListener {
                val intent = Intent(context, DetailHero::class.java).apply {
                    putExtra("heroImage", item.imageResource)
                    putExtra("heroTitle", item.title)
                    putExtra("heroStory", item.story)
                }
                context.startActivity(intent)
            }
        }
    }
}
