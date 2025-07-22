Frontend (Angular)
Install Node.js (v20.19+ required)

bash
Copy
Edit
nvm install 20.19
nvm use 20.19
Setup Angular CLI

bash
Copy
Edit
npm install -g @angular/cli
Install Dependencies and Run

bash
Copy
Edit
cd frontend
npm install
ng serve
Exposed Port

The frontend runs at: http://localhost:4200

🔐 OAuth 2.0 Configuration
Type	Value
Grant Type	password
Token Endpoint	/api/auth/getToken

Username	user
Password	password
Token Type	Bearer
Algorithm	HS256 (with 32-char symmetric key)

NO CLIENT REGISTERES SINCE IT IS A Resource Owner Password Credentials Grant

 API Endpoints
🔒 Authentication
POST /api/auth/getToken
Description: Issues an access token (JWT) for valid user credentials.

Request (x-www-form-urlencoded):



grant_type=password
username=user
password=password
Sample Response:


{
  "access_token": "<JWT>",
  "token_type": "Bearer",
  "expires_in": 3600
}
📦 Products
GET /api/products
Description: Returns all available insurance products. Requires a valid Bearer token.

Request Header:

Authorization: Bearer <access_token>
Sample Response:



[
  {
    "id": "prod_001",
    "name": "Premium Health Plan",
    "type": "HEALTH",
    "coverage": "Full medical + dental coverage including annual checkups...",
    "price": 200.0
  },
  ...
]
✅ Todo / Improvements
Store users & clients in DB

Refresh token support

Role-based authorization

Production-ready deployment