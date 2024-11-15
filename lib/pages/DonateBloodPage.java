import 'package:flutter/material.dart';

class DonateBloodPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Need Blood'),
        backgroundColor: Colors.red,
        actions: [
          IconButton(
            icon: Icon(Icons.add),
            onPressed: () {
              // Add your action here
            },
          ),
        ],
      ),
      body: Center(
        child: GestureDetector(
          onTap: () {
            // Handle donate blood button tap
          },
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Container(
                height: 120,
                width: 120,
                decoration: BoxDecoration(
                  color: Colors.grey[700],
                  shape: BoxShape.circle,
                ),
                child: Icon(
                  Icons.bloodtype,
                  color: Colors.red,
                  size: 60,
                ),
              ),
              SizedBox(height: 16),
              Text(
                'Donate Blood',
                style: TextStyle(
                  fontSize: 18,
                  fontWeight: FontWeight.bold,
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
