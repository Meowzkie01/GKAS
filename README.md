# GKAS - Digital Wallet Dashboard

A responsive, client-side web application interface simulating a modern digital wallet dashboard. The application provides key user insights including balance management, quick transaction workflows, real-time dynamic promotion tracking, and complete record bookkeeping.

## 🚀 Features

*   **Two-Column Split Layout:** Enforces clean separation between dashboard management operations and complete ledger histories.
*   **Balance & Navigation Systems:** Instant visual presentation of multi-currency equivalent tracking with automated formatting. Includes seamless link routing straight to standard target interfaces (`cashin.html`, `send.html`, `bank.html`, `qr.html`).
*   **Responsive Proportional Grid:** Keeps functional call-to-action buttons locked into a perfect square aspect ratio across wide presentation standards.
*   **Dynamic Banner Ad Slot:** A built-in marketing promo banner area that randomly serves one of three unique contextual advertising modules (GKAS Plus, Account Security, and QR Cashback) on page load with matching isolated color profiles.
*   **Persistent Micro-Storage Architecture:** Reads customer state records (`gkasUser`) and historic action listings (`gkasHistory`) to dynamically generate real-time ledger outputs completely on the client side.

## 🛠️ Built With

*   **HTML5:** Semantic architecture layout structure.
*   **CSS3:** Native CSS Grid layouts, Flexbox alignments, dynamic element aspect-ratio locking, and responsive mobile media viewports.
*   **JavaScript (ES6):** Client-side routing checks, validation, string injections, and pseudo-random card distribution filters.

## 📦 Project Directory Structure

```text
├── index.html            # Login/Welcome authentication gate
├── dashboard.html        # Main balance and ledger container panel
├── cashin.html           # Fund loading interface logic
├── send.html             # Peer-to-peer transfer form layout
├── bank.html             # Commercial bank clearance portal layout
└── qr.html               # Visual payment validation layout