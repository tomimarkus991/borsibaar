import type { Metadata } from "next";
import { Geist, Geist_Mono } from "next/font/google";
import "./globals.css";
import { Toaster } from "react-hot-toast";

const geistSans = Geist({
  variable: "--font-geist-sans",
  subsets: ["latin"],
});

const geistMono = Geist_Mono({
  variable: "--font-geist-mono",
  subsets: ["latin"],
});

export const metadata: Metadata = {
  title: "Börsibaar",
  description: "Börsibaar",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en" className={"dark"}>
      <body
        className={`${geistSans.variable} ${geistMono.variable} antialiased`}
      >
        {children}
           <Toaster
                position="bottom-center"
                toastOptions={{
                  duration: 5000,
                  style: {
                    maxWidth: "720px",
                    whiteSpace: "pre-wrap",
                    wordBreak: "break-word"
                  },
                }}
              />
      </body>
    </html>
  );
}
