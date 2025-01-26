package com.example.technicaltestalfagiftproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContactListActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var contactAdapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list)

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val contacts = listOf(
            Contact("Clara Dewi", "https://images.unsplash.com/photo-1438761681033-6461ffad8d80?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8c3R1ZGVudCUyMHByb2ZpbGV8ZW58MHx8MHx8fDA%3D", "Jl. Kenanga No. 78, Bandung"),
            Contact("Andi Pratama", "https://img.freepik.com/free-psd/portrait-man-teenager-isolated_23-2151745763.jpg?ga=GA1.1.8030332.1699262086&semt=ais_hybrid", "Jl. Merdeka No. 123, Jakarta"),
            Contact("Budi Santoso", "https://img.freepik.com/free-photo/man-smiling-with-checkup-table-hands_1187-3315.jpg?ga=GA1.1.8030332.1699262086&semt=ais_hybrid", "Jl. Raya No. 45, Surabaya"),
            Contact("Dito Setiawan", "https://img.freepik.com/premium-photo/ai-images-generator-ai-image-style_1309753-24625.jpg?ga=GA1.1.8030332.1699262086&semt=ais_hybrid", "Jl. Kuningan No. 56, Yogyakarta"),
            Contact("Elsa Putri", "https://img.freepik.com/premium-photo/vertical-portrait-serious-teenage-woman-high-school-student-looking-pensive-camera-standing_639864-629.jpg?ga=GA1.1.8030332.1699262086&semt=ais_hybrid", "Jl. Pahlawan No. 99, Medan"),
            Contact("Farhan Hadi", "https://img.freepik.com/premium-photo/close-up-portrait-teenage-boy-with-backpack-against-white-background_1048944-7984414.jpg?ga=GA1.1.8030332.1699262086&semt=ais_hybrid", "Jl. Jenderal Sudirman No. 12, Makassar"),
            Contact("Gita Sari", "https://img.freepik.com/free-photo/business-finance-employment-female-successful-entrepreneurs-concept-smiling-professional-female-office-manager-ceo-e-commerce-company-looking-pleased-camera-white-background_1258-59171.jpg?ga=GA1.1.8030332.1699262086&semt=ais_hybrid", "Jl. Sejahtera No. 34, Bali"),
            Contact("Hadi Fadilah", "https://img.freepik.com/free-photo/young-businessman-dressed-casually-wearing-eyewear-having-stylish-hairdo-keeping-hands-yellow-folder-with-papers-documents-going-office-work-prepare-business-report-business_176532-8301.jpg?ga=GA1.1.8030332.1699262086&semt=ais_hybrid", "Jl. Raya Selatan No. 89, Malang"),
            Contact("Indra Wijaya", "https://img.freepik.com/free-photo/medium-shot-smiley-man-portrait_23-2149455852.jpg?ga=GA1.1.8030332.1699262086&semt=ais_hybrid", "Jl. Suka Maju No. 102, Semarang"),
            Contact("Joko Suryanto", "https://img.freepik.com/premium-photo/concept-traveling-asian-man-blue-t-shirt-backpack-white_39688-4098.jpg?ga=GA1.1.8030332.1699262086&semt=ais_hybrid", "Jl. Cemara No. 21, Malang")
        )

        contactAdapter = ContactAdapter(contacts)
        recyclerView.adapter = contactAdapter
    }
}
