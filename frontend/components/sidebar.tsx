import {
    Sidebar,
    SidebarContent,
    SidebarFooter,
    SidebarGroup, SidebarGroupContent,
    SidebarGroupLabel,
    SidebarHeader, SidebarMenu, SidebarMenuButton, SidebarMenuItem,
} from "@/components/ui/sidebar"

import {ChartLine, Coins, Home, Package} from "lucide-react"

// Menu items.
const items = [
    {
        title: "Dashboard",
        url: "" +
            "/dashboard",
        icon: Home,
    },
    {
        title: "POS",
        url: "/pos",
        icon: Coins,
    },
    {
        title: "Inventory",
        url: "/inventory",
        icon: Package,
    },
    {
        title: "Client",
        url: "/client",
        icon: ChartLine,
    },
]

export function AppSidebar() {
    return (
        <Sidebar variant="floating" collapsible="icon">
            <SidebarContent>
                <SidebarGroup>
                    <SidebarGroupLabel className="text-md">
                        Börsibaar
                    </SidebarGroupLabel>
                    <SidebarGroupContent>
                        <SidebarMenu>
                            {items.map((item) => (
                                <SidebarMenuItem key={item.title}>
                                    <SidebarMenuButton asChild size="lg">
                                        <a
                                            href={item.url}
                                            className="flex items-center"
                                        >
                                            <item.icon className="!w-5 !h-5" />
                                            <span className="text-lg font-medium">{item.title}</span>
                                        </a>
                                    </SidebarMenuButton>
                                </SidebarMenuItem>
                            ))}
                        </SidebarMenu>
                    </SidebarGroupContent>
                </SidebarGroup>
            </SidebarContent>
        </Sidebar>
    )
}
