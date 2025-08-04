# Razorpay Payment Integration

This project demonstrates the integration of **Razorpay Payment Gateway** into a web application for secure and seamless online transactions.

---

## 📌 Features
- 🔒 Secure payment processing using Razorpay APIs  
- 💳 Supports multiple payment methods (UPI, Credit/Debit Cards, Net Banking, Wallets)  
- 🧾 Real-time transaction confirmation  
- 🚦 Success and failure callbacks handling  
- 📊 Order creation before payment  
- ✅ Easy to customize and extend  

---

## 📂 Project Structure

RazorPayment/
│── src/ # Application source code
│── static/ # CSS, JS, and frontend files
│── templates/ # HTML templates (if applicable)
│── application.properties (Spring Boot configs, if used)
│── pom.xml / package.json (depending on backend)
│── README.md



---

## ⚙️ Prerequisites
Before you begin, ensure you have the following installed:
- [Java 17+](https://adoptopenjdk.net/) (using Spring Boot)  
- [Maven](https://maven.apache.org/) or Gradle (for Java backend)  
- [Node.js](https://nodejs.org/) (frontend uses React/JS else go with themeleaf I have used thymeleaf)  
- [Git](https://git-scm.com/)  
- Razorpay account → [https://razorpay.com](https://razorpay.com)  

---

## 🚀 Setup & Installation

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/BATHULAVENKATESH/razorpayment_Integration.git
cd razorpayment_Integration


2️⃣ Configure Razorpay Credentials
Create a .env file (or add in application.properties for Spring Boot):

RAZORPAY_KEY_ID=your_key_id
RAZORPAY_KEY_SECRET=your_secret_key


3️⃣ Install Dependencies
Spring Boot:
mvn clean install

4️⃣ Run the Application
Spring Boot:
mvn spring-boot:run

💳 Payment Flow
User selects amount → clicks on "Pay Now".

Backend creates an order using Razorpay API.

Frontend opens Razorpay Checkout with order details.

User completes payment via preferred method.

Razorpay verifies transaction and sends response.

Backend validates signature and updates order/payment status.

📜 Example API Endpoints
Create Order
POST /api/payment/order

{
  "amount": 500,
  "currency": "INR",
  "receipt": "txn_12345"
}


Verify Payment
POST /api/payment/verify

json
{
  "razorpay_order_id": "order_ABC123",
  "razorpay_payment_id": "pay_XYZ789",
  "razorpay_signature": "generated_signature"
}

🛡️ Security
All API calls use Razorpay’s secure HTTPS endpoints.

Signature verification ensures authenticity of transactions.

Sensitive credentials are stored in environment variables.



🏗️ Future Enhancements
📧 Email/SMS notification on successful payments

📦 Order & invoice management system

🔔 Webhook support for automated payment updates

🏦 Refunds and partial payments
